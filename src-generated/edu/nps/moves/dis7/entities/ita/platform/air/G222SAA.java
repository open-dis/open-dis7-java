package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a7288a3
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 22926
 */
public class G222SAA extends EntityType
{
    public G222SAA()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 18311, Cargo/Tanker
        setSubCategory((byte)1); // uid 18312, G.222/C-27 Spartan
        setSpecific((byte)6); // uid 22926, G.222SAA
    }
}