## Making a little program that inserts numbers
## using a binary tree data structure

#Just added insert()

class Node():

    def __init__(self,val):
        self.left = None
        self.right = None
        self.val = val

    def insert(self,val):
        if val > self.val:
            if self.right is None:
                self.right = Node(val)
            else:
                self.right.insert(val)

        elif val <= self.val:
            if self.left is None:
                self.left = Node(val)
            else:
                self.left.insert(val)

        else:
            self.val = val

def main():
    root = Node(10)
    root.insert(15)
    print root.val
    print root.left
    print root.right.val


main()
