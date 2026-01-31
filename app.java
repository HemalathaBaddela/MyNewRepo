
// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}gg

    
class Session:
    def __init__(self, number = 0):
      self.number = number
    
    def __len__(self):
      return self.number


# default length is 0
session1 = Session()
print(len(session1))  # Output: 0

session2 = Session(6)
print(len(session2))  # Output: 6
