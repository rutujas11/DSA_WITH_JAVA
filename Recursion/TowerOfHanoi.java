public class TowerOfHanoi {
    public static void towerofHanoi(int n, String src, String helper, String dest){
        ///transfering that first (saglayt khalchi ani mothi disk) to destination
        if(n == 1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        ///1) transferring n-1 disk(leave 1st(saglyat khalchi disk) as it is) to the helper using destination tower.
        ///therefore here destination become helper and helper becomes destination
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+ n +" from "+ src +" to "+ dest);

        ///2) now transferring that n-1 disks which we have transfered earlier to the helper to the destination using src tower as helper.
        ///therefore here src become helper and helper becomes src
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n = 3;
        towerofHanoi(n, "S", "H", "D");

    }
}
