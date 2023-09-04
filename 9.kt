@Test
void shouldGenerateCollectionFields(){
     //given
     EasyRandom easyRandom = new EasyRandom();
     //when
     User2 user = easyRandom.nextObject(User2.class);
     //then
     assertThat(user.getEmail()).isNotNull();
     assertThat(user.getFirstName()).isNotNull();
     assertThat(user.getLastName()).isNotNull();

     assertThat(user.getBooks()).isNotNull();
     assertThat(user.getBooks()).allMatch(book -> !book.getAuthor().isEmpty());

     assertThat(user.getSomeMap()).isNotNull();
     assertThat(user.getSomeMap().values()).extracting(Book::getAuthor).allMatch(author -> !author.isEmpty());

     // preview
     System.out.println(user.toString());
}
