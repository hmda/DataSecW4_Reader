public class ReadFile {
	public static void main(String[] args) {
		Content_Tag content_tag = new Content_Tag();
		content_tag.getContent_Tag();
		Tokenizer tokenizer = new Tokenizer();        
        tokenizer.token("output\\baomoi_content.txt", "output\\token.txt"); // Xác định các từ.
	}
}
