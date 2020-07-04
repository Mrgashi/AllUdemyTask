
public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
           // tree was empty, so our item becomes the head of the tree.
            this.root = newItem;
            return true;
        }

        // otherwise, start comparing from the root/head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int compariosn = (currentItem.compareTo(newItem));
            if (compariosn < 0) {
                // newItem is greater, move left
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no node at left so add new item here.
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (compariosn > 0) {
                // newItem is less, move to left position if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there is no node at left, so add item here
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // equal, so dont add items in the list.
                System.out.println(newItem.getValue() + " is equal to earlier input, not adding");
                return false;
            }
        }
        // this is just java complaining about needing an return statement, we wont actually get this deep.
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int compariosn = (currentItem.compareTo(item));
            if (compariosn < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (compariosn > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we have found the item so remove it
                performeRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performeRemoval(ListItem item, ListItem parent) {
        // removing item from tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree ( it may be null)
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == null) {
                // item is right child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be an item, witch means we are looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree ( may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == null) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root at this point.
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion now is a lot trickier!
            // from the right sub-tree, find the smalest value (i.e., the leftmost)
            ListItem current = item.next();
            ListItem leftMostParent = item;
            while (current.previous() != null) {
                leftMostParent = current;
                current = current.previous();
            }
            // now put the smallest value into our node to be deleted!
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftMostParent == item) {
                // there was no leftmost node, so our "current" points to the smallest.
                // node ( the one that must now be deleted )
                 leftMostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method to traverse the searchTree.
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
