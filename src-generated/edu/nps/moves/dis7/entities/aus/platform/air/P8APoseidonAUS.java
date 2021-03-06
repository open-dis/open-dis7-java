package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64b8f8f4;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 31678
 */
public class P8APoseidonAUS extends EntityType
{
    /** Default constructor */
    public P8APoseidonAUS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 26358, ASW/Patrol/Observation
        setSubCategory((byte)2); // uid 31677, Boeing P-8 Multi-Mission Maritime Aircraft (MMA)
        setSpecific((byte)1); // uid 31678, P-8A Poseidon (AUS)
    }
}
