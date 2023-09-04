@Test
void shouldGenerateProperFields(){
     //given
     EasyRandom easyRandom = new EasyRandom();
     //when
     User3 user = easyRandom.nextObject(User3.class);
     //then
     System.out.println(user.toString());
     assertThat(user.getEmail()).isNotNull();
     assertThat(user.getFirstName().length()).isBetween(3,5);
}
