import java.util.Scanner;

public class GameController {
    private Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("슬롯머신 게임에 오신 것을 환영합니다!");

        while (true) { // 코인이 다 떨어지거나 재시작 의사가 없을 때까지 반복
            // 보유 코인 입력
            System.out.print("보유 코인을 입력하세요: ");
            AbstractSlotMachine.COINS = scanner.nextInt();

            while (AbstractSlotMachine.COINS > 0) { // 코인이 있으면 반복
                // 배팅할 코인 입력
                System.out.print("배팅할 코인을 입력하세요: ");
                int bet = scanner.nextInt();
                System.out.printf("현재 코인은 %d입니다.%n", AbstractSlotMachine.COINS - bet);


                if (bet > AbstractSlotMachine.COINS) { // 배팅코인을 보유 코인보다 많이 넣었을 경우
                    System.out.println("배팅할 코인이 보유 코인보다 많습니다. 다시 입력하세요.");
                    System.out.println("(구라핑ㄴㄴ)");
                    continue;
                }

                // 배팅 후 코인 차감
                AbstractSlotMachine.COINS -= bet;

                // 난이도 선택
                System.out.print("난이도를 선택하세요 (1: 下(하), 2: 中(중), 3: 上(상)): ");
                int difficulty = scanner.nextInt();

                SlotMachine machine = null; // 인터페이스 SlotMachine 변수 초기화
                switch (difficulty) {
                    case 1: // 난이도 하
                        System.out.println("난이도 下(하)의 당첨 확률은 11% 입니다.");
                        machine = new EasySlotMachine();
                        break;
                    case 2:
                        System.out.println("난이도 中(중)의 당첨 확률은 4% 입니다.");
                        machine = new MediumSlotMachine();
                        break;
                    case 3:
                        System.out.println("난이도 上(상)의 당첨 확률은 2% 입니다.");
                        System.out.println("🎊럭키 7의 확률은 0.2% 입니다.🎊");
                        machine = new HardSlotMachine();
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        continue;
                }

                // 게임 실행
                machine.play(bet);

                // 보유 코인 출력
                System.out.println("현재 보유 코인: " + AbstractSlotMachine.COINS);

                // 재시작 여부 확인
                if (AbstractSlotMachine.COINS <= 0) {
                    System.out.println("보유 코인이 0입니다. 게임을 종료합니다.");
                    System.out.println("그지 ㄲㅈ");
                    return;
                }

                System.out.print("게임을 다시 시작하시겠습니까? (Y/N): ");
                String restart = scanner.next();

                if (!restart.equalsIgnoreCase("y")) {
                    // 대소문자 구분 없이 문자 확인
                    System.out.println("게임을 종료합니다.");
                    return;
                }
            }
        }
    }
}
