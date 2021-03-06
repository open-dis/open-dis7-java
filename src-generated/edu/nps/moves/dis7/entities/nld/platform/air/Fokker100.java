package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a62b2a4;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23874
 */
public class Fokker100 extends EntityType
{
    /** Default constructor */
    public Fokker100()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23872, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23873, Twin Jet
        setSpecific((byte)1); // uid 23874, Fokker 100
    }
}
