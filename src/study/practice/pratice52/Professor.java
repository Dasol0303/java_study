package study.practice.pratice52;

public class Professor {

		int profno;
		String name;
		String id;
		String position;
		int pay;
		int deptno;

		
		public Professor() {}
		
		public Professor(int profno, String name, String id, String position, int pay, int bonus) {
			this.profno = profno;
			this.name = name;
			this.id = id;
			this.position = position;
			this.pay = pay;
			this.deptno = deptno;
		}

		public int getProfno() {
			return profno;
		}

		public void setProfno(int profno) {
			this.profno = profno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public int getPay() {
			return pay;
		}

		public void setPay(int pay) {
			this.pay = pay;
		}


		public int getDeptno() {
			return deptno;
		}

		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}

		@Override
		public String toString() {
			return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
					+ pay + ", deptno=" + deptno + "]";
		}

		


}
