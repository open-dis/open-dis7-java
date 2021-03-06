package edu.nps.moves.dis7.entities.rus.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2ee92e7d;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 20571
 */
public class Kh31ADKryptonAS17B extends EntityType
{
    /** Default constructor */
    public Kh31ADKryptonAS17B()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 20530, Guided
        setSubCategory((byte)26); // uid 20569, Kh-31 Krypton (AS-17) Non-ARM
        setSpecific((byte)2); // uid 20571, Kh-31AD Krypton (AS-17B)
    }
}
