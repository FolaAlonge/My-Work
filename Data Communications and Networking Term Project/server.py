import threading
import socket

host = '127.0.0.1'
port = 55555
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((host, port))
server.listen()

clients = []
usernames = []

def post(message):
    for client in clients:
        client.send(message)

def handleServer (client):
    while True:
        try:
            message = client.recv(1024)
            post(message)
        except:
            index = clients.index(client)
            clients.remove(client)
            username = usernames[index]
            usernames.remove(username)
            post(f'{username} has left...'.encode('ascii'))
            client.close()
            break

def receive():
    while True:
        client, address = server.accept()
        print(f'connection is established with {str(address)}')
        client.send('USER'.encode('ascii'))
        username = client.recv(1024)

        usernames.append(username)
        clients.append(client)

        print(f'This client is {username}'.encode('ascii'))
        post(f'{username} has connected...'.encode('ascii'))
        client.send('You are connected!'.encode('ascii'))

        thread = threading.Thread(target=handleServer, args=(client,))
        thread.start()

print("Server is running...")
receive()
