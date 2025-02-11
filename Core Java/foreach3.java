public class foreach3 {
 
        public static void main(String[] args) {
                    int[] numbers = new int[50];      
                    
                    for (int i = 0; i < 50; i++) {
                        numbers[i] = i + 1; 
                    }
                    for (int num : numbers) {
                        
                        System.out.println(num);
                    }

                    // eg2:
                    char[] name={'a','b','c','d'};
                    String [] name1= {"muktha","ghosh"};


                    for(char names:name ){
                        System.out.println(names);
                    }
                   
                    for( String names2: name1){
                        System.out.println(names2);
                    }

                }
            }
/*
 My approach: 
assigning a value eg:i=1 then we are going back to for loop 


 */