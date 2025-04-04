class Board {
    private int num;
    private String subject;
    private String content;
    private String writer;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }
}

class NoticeBoard extends Board {
    private String file;

    public void setFile(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }
}

class QNABoard extends Board {
    private int vote;

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getVote() {
        return vote;
    }
}

public class BoardTest {
    public static void main(String[] args) {
        NoticeBoard nb = new NoticeBoard();
        nb.setNum(1);
        nb.setSubject("공지사항입니다");
        nb.setContent("공지사항의 내용입니다.");
        nb.setWriter("관리자");
        nb.setFile("첨부파일.zip");

        QNABoard qna = new QNABoard();
        qna.setNum(2);
        qna.setSubject("질문답변입니다.");
        qna.setContent("자유게시판의 내용입니다.");
        qna.setWriter("회원1");
        qna.setVote(123);

        System.out.println("NoticeBoard:");
        System.out.println("Num: " + nb.getNum());
        System.out.println("Subject: " + nb.getSubject());
        System.out.println("Content: " + nb.getContent());
        System.out.println("Writer: " + nb.getWriter());
        System.out.println("File: " + nb.getFile());

        System.out.println("-------");

        System.out.println("QNABoard:");
        System.out.println("Num: " + qna.getNum());
        System.out.println("Subject: " + qna.getSubject());
        System.out.println("Content: " + qna.getContent());
        System.out.println("Writer: " + qna.getWriter());
        System.out.println("Vote: " + qna.getVote());
    }
}
