@Test
void shouldGenerateUserWithFilledFields(){
//given
     EasyRandom easyRandom = new EasyRandom();
     //when
     User user = easyRandom.nextObject(User.class);
     //then
     assertThat(user.getEmail()).isNotEmpty();
     assertThat(user.getFirstName()).isNotEmpty();
     assertThat(user.getLastName()).isNotEmpty();
     // preview
     System.out.println(user.toString());
}
