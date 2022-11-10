package moolya1;
class sa {
    int id;
    String surname;

    public void met() {
        System.out.println(id);
        System.out.println(surname);
    }

    public void met1() {
        int x = id + 2;
        System.out.println(x);
        System.out.println(surname.length());
    }

        public static void main(String[] args) {
            sa su = new sa();
            su.id = 345; su.surname = "saviarun";
            su.met();
            su.met1();
        }
    }


