import './Personaje.css'

function Personaje(props){

    return(
        //JSX

        <div className='container'>
            <h2>{props.nombre}</h2>
            <p>{props.detalle}</p>
            <img className="foto" src={props.foto} />
        </div>
    );
}

export default Personaje;

