import React from 'react';
import Contacts from './components/Contacts';
import './App.css';

function App() {
    return (
        <div className="container-fluid">
            <nav>
                <div className="nav-wrapper center-align"></div>
                <a href="/" className="brand-logo">Contacts</a>
            </nav>
            <div className="row">
            <Contacts/>
            </div>
        </div>
    );
}

export default App;
