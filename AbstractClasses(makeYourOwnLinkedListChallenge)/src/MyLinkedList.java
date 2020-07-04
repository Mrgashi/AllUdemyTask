
public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public MyLinkedList() {

    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }


    @Override
    public boolean addItem(ListItem newItem) {
        // the list was empty, so this item becomes the head of the list
        if(this.root == null) {
            this.root = newItem;
            return true;
        }

    ListItem currentItem = this.root;
        while(currentItem !=null) {
        int comparison = (currentItem.compareTo(newItem));
        if (comparison < 0) {
            // newItem is greater, move right if possible
            if (currentItem.next() != null) {
                currentItem = currentItem.next();
            } else {
                // there is no next, so insert at en of list
                currentItem.setNext(newItem).setPrevious(currentItem);
                return true;
            }
        } else if (comparison > 0) {
            // newItem is less, insert before
            if (currentItem.previous() != null) {
                currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                newItem.setNext(currentItem).setPrevious(newItem);
            } else {
                // the node with a previous is the root
                newItem.setPrevious(this.root).setPrevious(newItem);
                this.root = newItem;
            }
            return true;
        } else {
            // equal
            System.out.println(newItem.getValue() + " is already present, not added");
            return false;
        }
    }

        return false;
}

    @Override
    public boolean removeItem(ListItem item) {
        if (item!=null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found item to delete.
                //NEED TEST TO CHECK IF ROOT/HEAD
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    // putting current item into next position? Bypassing the deleted item
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null ) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }
            else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // comparios > 0
                // we are at a position grater than the one being deleted.
                // so the item is not in the list.
                return false;
            }
        }
        // we have reached the end of the list.
        // without finding our item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("the list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
