package edu.nps.moves.dis7.entities.sgp.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f117b3d;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28712
 */
public class IntegratedFireUnitIFU extends EntityType
{
    /** Default constructor */
    public IntegratedFireUnitIFU()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 28710, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 28711, M113A2 Ultra Mechanised Igla
        setSpecific((byte)1); // uid 28712, Integrated Fire Unit (IFU)
    }
}
