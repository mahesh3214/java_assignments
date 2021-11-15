package javaassignments;



	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.StandardOpenOption;
	import java.util.Iterator;
	import java.util.List;
	import java.util.stream.Collectors;
			public class Assignment4 {

				public static void main(String[] args) {
					var path="C:\\Users\\mahes\\OneDrive\\Documents\\java11\\java.txt";
					
					
					try
					{
						//Files.writeString(Path.of(path),"\nHarsha", StandardOpenOption.APPEND);
						String data=Files.readString(Path.of(path));
						//" andd  " ="andd"
						List<String>str=data.lines()
								.map(s->s.trim())
								.filter(s -> !s.isEmpty())
					             .collect(Collectors.toList());
						
						for (String string : str) {
							System.out.println(string);
						}
						System.out.println("The total students are :"+str.size());
				
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}

			}