object ceaserCipher{
	
	def main(args:Array[String]){

		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		val encription = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)+key)%a.size);
		val decription = (c:Char, key:Int, a:String) => a((a.indexOf(c.toUpper)-key+a.size)%a.size);
	
		print("Enter text: ");
		var text = scala.io.StdIn.readLine();
		print("Enter Key: ");
		var key = scala.io.StdIn.readInt();

		val cipher = (pattern:(Char, Int, String)=> Char, s:String, key:Int, a:String)=>s.map(pattern(_, key, a))
	
		println("Text : " + text);
		println("Encripted Text: " + cipher(encription, text, key, alphabet));
		println("Decrypted Text: " + cipher(decription, text, key, alphabet));

	}
}