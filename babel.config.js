module.exports = {
  presets: [
    [
      'module:metro-react-native-babel-preset',
      {
        unstable_disableES6Transforms: true,
      },
    ],
  ],
  env: {
    production: {
      plugins: ['transform-remove-console'],
    },
  },
  plugins: [
    [
      'module-resolver',
      {
        root: ['./src'],
        alias: {
          '@': './src',
          container: './src/containers',
          component: './src/components',
          helper: './src/helper',
          navigator: './src/Navigator',
          globalData: './src/globalData',
        },
      },
    ],
  ],
};
