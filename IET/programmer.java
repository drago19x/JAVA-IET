class programmer extends employee{
    int bonus=100;
    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println("programmer salary is:"+p.get());
        System.out.println("bonus of programmer is:"+p.bonus);
    }
}
