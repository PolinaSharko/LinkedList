import java.util.LinkedList;
import java.util.ListIterator;

public class SortedIntegerList {
    private boolean listType;
    private LinkedList<Integer> list;

    SortedIntegerList(boolean Type){
        this.listType = Type;
        list = new LinkedList<>();

    }

    public void add(int value){
            ListIterator<Integer> itlist = list.listIterator();
            if(this.listType == false){
                while(itlist.hasNext()) {
                    if (itlist.next() == value) {
                        return;
                    }
                }
                while(itlist.hasPrevious()){
                    if(itlist.previous() < value){
                        itlist.next();
                        break;
                    }
                }
                itlist.add(value);
            }
            else{
                while(itlist.hasNext()){
                    if(itlist.next() > value){
                        itlist.previous();
                        break;
                    }
                }
                itlist.add(value);
            }
        }

    public void remove(int value){
        ListIterator<Integer> itlist = list.listIterator();
        while(itlist.hasNext()){
            if(itlist.next() == value){
                itlist.remove();
            }
        }
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        else{
            SortedIntegerList list1 = (SortedIntegerList) obj;
            if(list1.list.size() != this.list.size()){
                return false;
            }
            else{
                ListIterator<Integer> oitl = list.listIterator();
                ListIterator<Integer> thisitl = list.listIterator();
                while(thisitl.hasNext()){
                    if(thisitl.next()!= oitl.next()){
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public SortedIntegerList getLessThan (int i){
        ListIterator<Integer> itlist = list.listIterator();
        SortedIntegerList res = new SortedIntegerList (this.listType);
        while(itlist.hasNext()){
            int value = itlist.next();
            if (i>value){
                res.add(value);
            }
            else {
                break;
            }
        }
        return res;
    }

    public String toString(){
        StringBuilder buff = new StringBuilder();
        ListIterator<Integer> itlist = list.listIterator();
        while(itlist.hasNext()){
            buff.append(itlist.next());
            buff.append(" ");
        }
        buff.append("\n");
        return buff.toString();
    }

}