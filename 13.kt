@Test
void shouldGenerateListOfUsers(){
     List<User2> users = new EasyRandom()
.objects(User2.class, streamSize:5)
.toList();

     assertThat(users.size()).isEqualTo(5);
     assertThat(users).allMatch(user -> !user.getEmail().isEmpty())
             .allMatch(user-> !user.getFirstName().isEmpty());
}
