package com.mydao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mycompany.Student;

@Transactional
public class StudentDao {

		@Autowired
		HibernateTemplate ht;

		

		public HibernateTemplate getHt() {
			return ht;
		}



		public void setHt(HibernateTemplate ht) {
			this.ht = ht;
		}



		public int insert(Student st) {
			int i = (Integer) ht.save(st);

			return i;
		}
		
		public List<Student> selectAll(){
			List<Student> l = ht.loadAll(Student.class);
			return l;
		}
		
		public Student findbyId(Integer id) {
		
			return ht.get(Student.class,id);
		}

		public void delete(Student st) {
			ht.delete(st);
		}
		
		public void update(Student stu) {
			ht.update(stu);
		}
		
}
