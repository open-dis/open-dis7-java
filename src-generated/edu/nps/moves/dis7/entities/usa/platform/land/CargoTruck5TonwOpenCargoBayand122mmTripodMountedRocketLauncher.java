package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@32456db0;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 24948
 */
public class CargoTruck5TonwOpenCargoBayand122mmTripodMountedRocketLauncher extends EntityType
{
    /** Default constructor */
    public CargoTruck5TonwOpenCargoBayand122mmTripodMountedRocketLauncher()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24926, Single Unit Cargo Truck
        setSubCategory((byte)12); // uid 24946, Cargo Truck, up to 5 Ton
        setSpecific((byte)1); // uid 24947, Cargo Truck, 5 Ton w/ Open Cargo Bay
        setExtra((byte)1); // uid 24948, Cargo Truck, 5 Ton w/ Open Cargo Bay and 122mm Tripod-Mounted Rocket Launcher
    }
}
