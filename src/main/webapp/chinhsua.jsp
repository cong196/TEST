<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<script src="ckeditor/ckeditor.js"></script>


<t:icsse2017>
	<jsb:body>
		<td>
			<form action="" method="post">
				<!-- (2): textarea sẽ được thay thế bởi CKEditor -->
				<textarea id="editor1" name="editor1" cols="80" rows="10">
				</p>			
				
	       </textarea>
				<!-- (3): Code Javascript thay thế textarea có id='editor1' bởi CKEditor -->
				<script>
			    // Turn off automatic editor creation first.
			    //CKEDITOR.disableAutoInline = true;
			    CKEDITOR.replace( 'editor1' );
			    const editor1 = CKEDITOR.instances.editor1;
			    editor1.setData('<H1>${message}</H1>')
			</script>
			</form>
		<td>
	</jsb:body>
</t:icsse2017>	
