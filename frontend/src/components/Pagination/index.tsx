import { ReactComponent as Arrow } from 'assets/img/Arrow.svg';
import './styles.css'
function Pagination() {
    return (
        <div className="fnmovie-pagination-container">
            <div className="fnmovie-pagination-box">
                <button className="fnmovie-pagination-button" disabled={true} >
                    <Arrow />
                </button>
                <p>{`${1} de ${3}`}</p>
                <button className="fnmovie-pagination-button" disabled={false} >
                    <Arrow className="fnmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;