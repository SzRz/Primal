
public class ArrayOfRecord
{
    Record[] records;
    public ArrayOfRecord(int l){
        records = new Record[l];
        for(int i = 0; i < l; i++){
            records[i] = new Record();
        }
    }

    public void sortBy(int type, String order){
        switch(type){
            case 1:
            bubbleSort(order);
            break;
            case 2:
            selectSort();
            break;
            case 3:
            insertSort();
            break;
        }
    }

    private void bubbleSort(String order){
        if(order == "index"){
            boolean repeat;
            int pos = records.length-1;
            do{
                repeat = false;
                for(int i = 0; i < pos; i++){
                    if(records[i].index > records[i+1].index){
                        Record temp = records[i];
                        records[i] = records[i+1];
                        records[i+1] = temp;
                        repeat = true;
                    }
                }
                pos--;
            }while(repeat);
        }else if(order == "value"){
            boolean repeat;
            int pos = records.length-1;
            do{
                repeat = false;
                for(int i = 0; i < pos; i++){
                    if(records[i].value > records[i+1].value){
                        Record temp = records[i];
                        records[i] = records[i+1];
                        records[i+1] = temp;
                        repeat = true;
                    }
                }
                pos--;
            }while(repeat);
        }else if(order == "name"){
            boolean repeat;
            int pos = records.length-1;
            do{
                repeat = false;
                for(int i = 0; i < pos; i++){
                    if(records[i].name.compareTo(records[i+1].name) > 0){
                        Record temp = records[i];
                        records[i] = records[i+1];
                        records[i+1] = temp;
                        repeat = true;
                    }
                }
                pos--;
            }while(repeat);
        }else if(order == "sign"){
            boolean repeat;
            int pos = records.length-1;
            do{
                repeat = false;
                for(int i = 0; i < pos; i++){
                    if(Character.toLowerCase(records[i].sign) > Character.toLowerCase(records[i+1].sign)){
                        Record temp = records[i];
                        records[i] = records[i+1];
                        records[i+1] = temp;
                        repeat = true;
                    }
                }
                pos--;
            }while(repeat);
        }
    }

    private void selectSort(){

    }

    private void insertSort(){

    }
}
