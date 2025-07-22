public class InitExample {
    public static void main(String[] args) {
        // 초기값 배열
        int[] init = {1, 2, 3, 4, 5};

        // 복사하여 사용 (init은 변하지 않음)
        int[] workingArray = init.clone();

        // workingArray를 조작
        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] *= 2;
        }

        // 출력
        System.out.println("초기값(init):");
        for (int i : init) {
            System.out.print(i + " ");
        }

        System.out.println("\n작업값(workingArray):");
        for (int i : workingArray) {
            System.out.print(i + " ");
        }
    }
}
