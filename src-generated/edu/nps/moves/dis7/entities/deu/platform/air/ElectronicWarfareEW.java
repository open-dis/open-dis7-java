package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@5f0fd5a0
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 16344
 */
public class ElectronicWarfareEW extends EntityType
{
    public ElectronicWarfareEW()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 16344, Electronic Warfare (EW)
    }
}