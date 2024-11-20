package se.davand.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import se.davand.dao.CourseDAO;
import se.davand.entity.Course;
import se.davand.entity.Student;

import java.util.List;
import java.util.Optional;

public class CourseDAOImpl implements CourseDAO {
    private SessionFactory sessionFactory;

    public CourseDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Course course) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(course);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Course> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Course.class, id));
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Course> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Course", Course.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public void update(Course course) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(course);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Course course) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Kontrollera om det finns studenter på kursen
            String query = "FROM Student WHERE course.id = :courseId";
            List<Student> students = session.createQuery(query, Student.class)
                    .setParameter("courseId", course.getId())
                    .getResultList();

            if (!students.isEmpty()) {
                throw new IllegalStateException("Cannot delete course with existing students. Remove or reassign students first");
            }

            // Om det inte finns några studenter, ta bort kursen
            session.remove(course);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}