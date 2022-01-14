import { ReactComponent as Arrow } from 'assets/img/Arrow.svg';
import { MoviePage } from 'types/movie';
import './styles.css'

type Props ={
    page: MoviePage;
    onChange: Function
}
function Pagination({page, onChange}: Props) {
    return (
        <div className="fnmovie-pagination-container">
            <div className="fnmovie-pagination-box">
                <button className="fnmovie-pagination-button" disabled={page.first} 
                onClick={() => onChange(page.number - 1)}>
                    <Arrow />
                </button>
                <p>{`${page.number + 1} de ${page.totalPages}`}</p>
                <button className="fnmovie-pagination-button" disabled={page.last} 
                onClick={() => onChange(page.number + 1)}>
                    <Arrow className="fnmovie-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;