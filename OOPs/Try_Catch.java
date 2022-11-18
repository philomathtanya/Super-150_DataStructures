public class Try_Catch {
        int age;
        String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) throws Exception{
            try{
                if(age<0){
                    throw new Exception("Negative Image");
                }
                this.age = age;
            }
            catch(Exception e){
                e.printStackTrace();
            }
            finally {
                System.out.println("Finally Block");
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
