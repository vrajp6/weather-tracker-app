
import './App.css';
import Weather from './components/Weather';

function App() {
  return (
    <div className="App">
    <header className="App-header">
      <h1 className='title'>Weather Tracker</h1>
    </header>
    <main>
      <Weather /> 
    </main>
  </div>
  );
}

export default App;
