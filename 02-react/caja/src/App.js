import './App.css';
import Personaje from './Personaje'

const personajes = [
  {nombre: "Profesor", detalle:"Jefe", foto: "https://wallpapercave.com/wp/wp5988791.jpg"},
  {nombre: "Tokio", detalle:"Relata", foto: "https://wallpapercave.com/wp/wp8638125.jpg"},
  {nombre: "Berlin", detalle:"Pensador", foto: "https://wallpapercave.com/wp/wp5475153.jpg"},
  {nombre: "Marsella", detalle:"Repartidor", foto: "https://pbs.twimg.com/media/EUxAM1bU0AAa8hi.jpg"},

]

function App() {
  return (
    //jsx
    <div>
      <h1>Casa de papel</h1>
      <div className="contPersonajes">
        {personajes.map(personaje => (
     
          <Personaje key={personaje.nombre} nombre={personaje.nombre} detalle={personaje.detalle} foto={personaje.foto}/>
       
        ) ) }
     
        
      </div>
    </div>
  );
}

export default App;
