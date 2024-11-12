public class CellPhone {
    public String model = "unknown";
    public String[] contacts = new String[3];
    public int contstored = 0;

    public void printDetails(){
        System.out.println("Phone model "+model);
        System.out.println("Contacts Stored "+contstored);
        if(contstored > 0){
            System.out.println("Stored contacts: ");
            for(int i = 0;i<contstored;i++){
                System.out.println(contacts[i]);
            }
        }
    }
    public void storeContact(String num){
        if(contstored > 2){
            System.out.println("Memory full.New contact can't be stored");
            return;
        }
        contacts[contstored] = num;
        System.out.println("Contact Stored");
        contstored++;
    }
}
