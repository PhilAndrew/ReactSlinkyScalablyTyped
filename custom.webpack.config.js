var merge = require('webpack-merge');
var generated = require('./scalajs.webpack.config');
const MonacoWebpackPlugin = require("monaco-editor-webpack-plugin");

var local = {
    module: {
        rules: [
            {
                test: /\.css$/,
                use: ['style-loader', 'css-loader']
            },
            {
                test: /\.(ttf|eot|woff|png|glb|svg)$/,
                use: 'file-loader'
            },
            {
                test: /\.(eot)$/,
                use: 'url-loader'
            }
        ]
    },
    plugins: [
        new MonacoWebpackPlugin({
            languages: ["json", "javascript", "typescript"],
        }),
    ],
};

module.exports = merge(generated, local);
