public class Main {
    public static void main(String[] args) {
        int length = 0;
        int quantity = 0;
        for (int i = 0; i < args.length; i++) {
            String[] tokens = args[i].split("=");
            if (tokens[0].equals("length"))
                length = Integer.parseInt(tokens[1]);
            else if (tokens[0].equals("quantity"))
                quantity = Integer.parseInt(tokens[1]);
            else
                System.out.println("!Error, Incorrect entry of length or quantity!");
        }
System.out.println("������������ ������ �2\n"+
                              "��������: ��. ��. ��-171\n"+
                              "������ �.�.\n"+
                              "�������: �������� ���������� ��������� �������\n");
        System.out.format("length = %d quantity=%d\n\n", length, quantity);
        PasGen a = new PasGen();
        for (int i = 0; i < quantity; i++)
            System.out.println(a.generation(length));
    }
}
