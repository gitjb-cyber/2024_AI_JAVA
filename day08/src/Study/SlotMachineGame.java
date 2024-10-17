package Study;

import java.util.Scanner;

public class SlotMachineGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배팅할 코인의 수 입력: ");
        int betAmount = scanner.nextInt();

        System.out.print("게임 난이도 설정 (1: 쉬움, 2: 중간, 3: 어려움): ");
        int level = scanner.nextInt();

        GameSet slotMachine;
        switch (level) {
            case 1:
                slotMachine = new EasySlotMachine(betAmount);
                break;
            case 2:
                slotMachine = new MediumSlotMachine(betAmount);
                break;
            case 3:
                slotMachine = new HardSlotMachine(betAmount);
                break;
            default:
                System.out.println("잘못된 난이도입니다.");
                return;
        }

        slotMachine.spin();
        slotMachine.displayResult();
        System.out.println("당신의 보상: " + slotMachine.getPayout() + " 코인");
    }
}
