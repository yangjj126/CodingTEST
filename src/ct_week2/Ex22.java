package ct_week2;
/*
List (Vector)
 */

import java.util.List;
import java.util.Vector;

public class Ex22 {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();
        // 게시자, 날짜, 등록 등은 게시물을 올린 사람 정보, 글이 작성된 시각, 그리고 게시글의 등록 상태
        Board board = new Board();
        // Board의 생성자를 허출 및 객체 생성
        board.setNo(1);
        board.setTitle("제목1");
        board.setCn("네용1");
        board.setWriter("작성자1");
        list.add(new Board(2, "제목2", "내용2" , "작성자2" ));
        list.add(new Board(3, "제목3", "내용3" , "작성자3" ));
        list.add(new Board(4, "제목4", "내용4" , "작성자4" ));
        list.add(new Board(5, "제목5", "내용5" , "작성자5" ));
        list.add(new Board(6, "제목6", "내용6"));
        print(list);
    }
    private static void print(List<Board> list) {
        System.out.println("==============");
        System.out.println("번호\t제목\t내용\t작성자");
        for (int i = 0; i < list.size(); i++){
            Board board = list.get(1);
            System.out.printf("%d\t%s\t%s\t%s\n", board.getNo(),board.getTitle(),board.getCn(),board.getWriter());
        }
    }
}
