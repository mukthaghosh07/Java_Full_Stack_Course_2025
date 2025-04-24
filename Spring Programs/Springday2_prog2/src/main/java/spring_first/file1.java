package spring_first;

public class file1 {

		private file2 message;
		
		public void setMessage(file2 message)
		{
		this.message=message;
		}
		public void getMessage(){
		System.out.println(message);
		}
		public void myMessage() {
		message.displayMessage();
		}
		}
