@Test
void shouldGenerateCarsRecords() {
     List<Car> cars = new EasyRandom().objects(Car.class, 5).toList();

     assertThat(cars.size()).isEqualTo(5);
     assertThat(cars)
             .allMatch(car -> !car.brand().isEmpty())
             .allMatch(car -> !car.model().isEmpty());
     cars.forEach(System.out::println);
}
