class count {
    public static void main(String[] args) {
        count(5);
    }
    public static void count(int n){
        if(n==0) return;
        System.out.print(n+" ");
        count(n-1);
    }
}
