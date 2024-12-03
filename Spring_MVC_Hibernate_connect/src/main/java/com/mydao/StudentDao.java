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
		public List<Student> selectAll(Student st){
			List<Student> l = ht.loadAll(Student.class);
			return l;
		}

		
}
