
package net.mcreator.workspacetest.fluid;

public abstract class CrudeoilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> WorkspaceTestModFluidTypes.CRUDEOIL_TYPE.get(), () -> WorkspaceTestModFluids.CRUDEOIL.get(), () -> WorkspaceTestModFluids.FLOWING_CRUDEOIL.get())
			.explosionResistance(1500f).levelDecreasePerBlock(2).slopeFindDistance(1).bucket(() -> WorkspaceTestModItems.CRUDEOIL_BUCKET.get()).block(() -> (LiquidBlock) WorkspaceTestModBlocks.CRUDEOIL.get());

	private CrudeoilFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (WorkspaceTestModParticleTypes.CRUDEDRIP.get());
	}

	public static class Source extends CrudeoilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CrudeoilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
