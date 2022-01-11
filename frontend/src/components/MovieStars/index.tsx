import { ReactComponent as StarFull } from 'assets/img/Starfull.svg';
import { ReactComponent as StarHalf } from 'assets/img/Starhalf.svg';
import { ReactComponent as StarEmpty } from 'assets/img/Starempty.svg';
import './styles.css'

function MovieStars(){
    return(
        <div className="fnmovie-stars-container">
        <StarFull />
        <StarFull />
        <StarFull />
        <StarHalf />
        <StarEmpty />
      </div>
    );
}

export default MovieStars;