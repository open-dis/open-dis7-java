package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1144a55a
 * Country: Poland (POL)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31695
 */
public class RosomakWEMMedicalEvacuationVehicle extends EntityType
{
    public RosomakWEMMedicalEvacuationVehicle()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 31693, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 31694, KTO Rosomak
        setSpecific((byte)1); // uid 31695, Rosomak WEM (Medical Evacuation Vehicle)
    }
}
