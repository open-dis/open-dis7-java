package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@19ad75e5;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32821
 */
public class NoDongNuclear5kt extends EntityType
{
    /** Default constructor */
    public NoDongNuclear5kt()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)2); // uid 21609, No Dong
        setSpecific((byte)1); // uid 21610, No Dong Separated Warhead
        setExtra((byte)5); // uid 32821, No Dong, Nuclear, 5 kt
    }
}
