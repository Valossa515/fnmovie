import { ReactComponent as GithubIcon } from 'assets/img/Github.svg';
import './styles.css'

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>FnMovie</h1>
          <a href="https://github.com/Valossa515/fnmovie">
            <div className="fnmovie-contact-container">
                 <GithubIcon />
              <p className="fnmovie-contact-link">/Valossa515</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  )
}
export default Navbar;
