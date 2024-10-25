
import hashlib
import getpass
def hash_password(password):
    return hashlib.sha256(password.encode()).hexdigest()

def main():
   userName = input("Enter username: ")
   password = getpass.getpass("Enter password: ")

   stored_username = "Marist"
   stored_password_hash = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd" \
                           "passw0rd"
    
    input_password_hash = hash_password(password)


   if(userName == stored_username and input_password_hash == stored_password_hash):
       print("Welcome Marist!")
   else:
       print("invalid input")

if __name__ == "__main__":
main()